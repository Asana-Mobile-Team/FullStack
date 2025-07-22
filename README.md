# Welcome to your Expo app 👋

This is an [Expo](https://expo.dev) project created with [`create-expo-app`](https://www.npmjs.com/package/create-expo-app).

## Get started

1. Install dependencies

   ```bash
   npm install
   ```

2. Start the app

   ```bash
   npx expo start
   ```

In the output, you'll find options to open the app in a

- [development build](https://docs.expo.dev/develop/development-builds/introduction/)
- [Android emulator](https://docs.expo.dev/workflow/android-studio-emulator/)
- [iOS simulator](https://docs.expo.dev/workflow/ios-simulator/)
- [Expo Go](https://expo.dev/go), a limited sandbox for trying out app development with Expo

You can start developing by editing the files inside the **app** directory. This project uses [file-based routing](https://docs.expo.dev/router/introduction).

## Get a fresh project

When you're ready, run:

```bash
npm run reset-project
```

This command will move the starter code to the **app-example** directory and create a blank **app** directory where you can start developing.

## Learn more

To learn more about developing your project with Expo, look at the following resources:

- [Expo documentation](https://docs.expo.dev/): Learn fundamentals, or go into advanced topics with our [guides](https://docs.expo.dev/guides).
- [Learn Expo tutorial](https://docs.expo.dev/tutorial/introduction/): Follow a step-by-step tutorial where you'll create a project that runs on Android, iOS, and the web.

## Join the community

Join our community of developers creating universal apps.

- [Expo on GitHub](https://github.com/expo/expo): View our open source platform and contribute.
- [Discord community](https://chat.expo.dev): Chat with Expo users and ask questions.

# Project Flow App

## Overview
Project Flow is a productivity and collaboration app designed to help teams and individuals efficiently manage projects, tasks, goals, and communication in a unified workspace. The app provides a modern, fast, and intuitive interface built with React Native, Expo, and Tailwind CSS, supporting both mobile and web platforms.

## What Problem Does It Solve?
- **Fragmented Workflows:** Many teams use multiple tools for project management, task tracking, goal setting, and communication. Project Flow unifies these workflows into a single, seamless experience.
- **Slow Navigation & Poor UX:** The app is optimized for instant navigation, fast routing, and smooth UI transitions, reducing friction and boosting productivity.
- **Lack of Visibility:** Users get a dashboard overview of all projects, tasks, and goals, making it easy to track progress and identify bottlenecks.
- **Collaboration Barriers:** Built-in chat, notifications, and team features foster real-time collaboration and accountability.

## How Does Project Flow Work?

### 1. **Authentication & User Management**
- Secure login and signup flows using Supabase Auth.
- User context is managed globally for access control and personalization.

### 2. **Dashboard**
- Central hub showing stats, recent activity, and quick links to projects, tasks, and goals.
- Visual charts and summary cards for instant insights.

### 3. **Projects**
- Create, edit, and manage projects with statuses, descriptions, and owners.
- Filter and search projects for easy access.

### 4. **Tasks**
- Assign tasks to team members, set due dates, and track status.
- Edit, delete, and search tasks with a fast, responsive UI.

### 5. **Goals**
- Set team or personal goals, track progress, and update status.
- Filter and manage goals to align with project objectives.

### 6. **Tabs & Navigation**
- Bottom tab navigation for instant access to Home, Account, Tasks, Inbox, Chat, and more.
- Prefetching and dynamic imports ensure fast screen transitions.

### 7. **Collaboration & Communication**
- Integrated chat and inbox for team messaging and notifications.
- Real-time updates and feedback for seamless teamwork.

### 8. **Performance Optimizations**
- Prefetching, code splitting, and memoization for fast navigation.
- Mount safety and efficient state management to prevent memory leaks and unnecessary renders.

## Technologies Used
- React Native & Expo
- Tailwind CSS (Nativewind)
- Supabase (Auth & Database)
- AsyncStorage for local persistence
- Expo Router for navigation

## Getting Started
1. Clone the repository and install dependencies:
   ```powershell
   git clone <repo-url>
   cd frontend_app
   npm install
   ```
2. Start the development server:
   ```powershell
   npm start
   ```
3. Open the app on your device or browser using Expo Go or the web preview.

## Folder Structure
- `app/` - Main application code (screens, components, context)
- `assets/` - Images and fonts
- `config/` - Supabase and app configuration
- `services/` - API integrations
- `constants/` - Theme and color definitions
- `hooks/` - Custom React hooks

## Contributing
Pull requests and suggestions are welcome! Please open an issue for feedback or feature requests.

## License
MIT
