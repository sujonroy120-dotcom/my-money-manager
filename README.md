# My Money Manager (Android project)

An offline-first personal finance tracker using Bangladeshi Taka (BDT). The Android shell loads a bundled local HTML app; no internet permission or remote service is used.

## Features
- Debit and credit transaction ledger
- Multiple account/wallet labels
- Savings, DPS, FDR and emergency fund tracking
- Borrowed/lent loans, outstanding balances and installment records
- Monthly category budgets
- Income/expense/savings/loan summary
- JSON backup/restore and CSV transaction export
- Local device storage using WebView DOM storage

## Build APK
1. Install Android Studio (Ladybug or newer) and Android SDK Platform 35.
2. Open this folder (`MyMoneyManager`) in Android Studio.
3. Allow Gradle sync.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. Debug APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

No bank login or automatic bank synchronization is included. Data is stored locally on this device. Export a JSON backup before uninstalling or clearing app data.
