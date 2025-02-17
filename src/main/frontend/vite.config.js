// vite.config.js
import { defineConfig } from 'vite'
import path from 'path'

export default defineConfig({
  build: {
    external: ['htmx.org', 'alpinejs'],
    rollupOptions: {
      input: {
        main: path.resolve(__dirname, 'src/main.js'),
        myComponent:  path.resolve(__dirname, 'src/components/myComponent.js'),
        // Add other entry points if needed
      },
      output: {
        entryFileNames: 'assets/[name].js',
        chunkFileNames: 'assets/[name].js',
        assetFileNames: 'assets/[name].[ext]',
      }
    }
  }
})