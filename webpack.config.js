const MiniCssExtractPlugin = require("mini-css-extract-plugin")
const CopyFilePlugin = require("copy-webpack-plugin")

module.exports = {
    mode: "development",
    entry: "./src/main/ts/bundle.ts",
    output: {
        path: __dirname + "/src/main/resources/static",
        filename: "bundle.js",
    },
    module: {
        rules: [
            {
                test: /\.(css|scss)$/,
                use: [
                    {
                        loader: MiniCssExtractPlugin.loader,
                    },
                    {
                        loader: "css-loader",
                        options: {
                            url: true,
                            sourceMap: false,
                            importLoaders: 2,
                        },
                    },
                    {
                        loader: "sass-loader",
                        options: {
                            sourceMap: false,
                        },
                    },
                ]
            },
            {
                test: /\.ts$/,
                loader: "ts-loader",
            },
            {
                test: /\.(jpg|png)$/,
                use: [
                    {
                        loader: "file-loader",
                        options: {
                            name: "[name].[ext]",
                            outputPath: "./",
                            publicPath: "./"
                        },
                    },
                ]
            },
        ],
    },
    resolve: {
        extensions: [".ts", ".js"],
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: `style.css`
        }),
        //new CopyFilePlugin({
        //    patterns: [
        //        {
        //            from: `${__dirname}/app/services/favicon.ico`,
        //            to: `${__dirname}/dist/assets`,
        //            context: `${__dirname}`,
        //        },
        //        {
        //            from: `${__dirname}/app/services/tw_logo.png`,
        //            to: `${__dirname}/dist/assets`,
        //            context: `${__dirname}`
        //        },
        //        {
        //            from: `${__dirname}/app/services/facelist.yaml`,
        //            to: `${__dirname}/dist/assets`,
        //            context: `${__dirname}`
        //        },
        //    ]
        //}),
    ]
};