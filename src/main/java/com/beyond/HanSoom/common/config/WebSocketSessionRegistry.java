package com.beyond.HanSoom.common.config;

import com.beyond.HanSoom.common.dto.SessionInfo;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class WebSocketSessionRegistry {
    private static final Map<String, SessionInfo> sessions = new ConcurrentHashMap<>();

    public static void register(String sessionId, SessionInfo sessionInfo) {
        sessions.put(sessionId, sessionInfo);
    }

    public static SessionInfo get(String sessionId) {
        return sessions.get(sessionId);
    }

    public static void unregister(String sessionId) {
        sessions.remove(sessionId);
    }
}
