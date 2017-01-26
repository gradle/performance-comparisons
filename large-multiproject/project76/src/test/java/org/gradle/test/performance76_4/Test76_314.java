package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_314 {
    private final Production76_314 production = new Production76_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}