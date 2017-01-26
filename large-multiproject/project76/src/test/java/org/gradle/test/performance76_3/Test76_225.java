package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_225 {
    private final Production76_225 production = new Production76_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}