
REM  "git push https://<GITHUB_ACCESS_TOKEN>@github.com/<GITHUB_USERNAME>/<REPOSITORY_NAME>.git"  

call ..\mpghpat.bat
call updatescaler.bat
git add *
git commit -m "Updated Changes"
git push https://%mghtoken%@github.com/sumankumarsingh1/UserAuthService1.git
