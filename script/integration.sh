npm run precompile-assets
npm start &
wait-on http://localhost:5000
cypress run --key a0cba5c6-0650-4abe-8d41-d990bb7a0a66
