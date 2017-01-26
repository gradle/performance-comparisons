package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_207 {
    private final Production76_207 production = new Production76_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}