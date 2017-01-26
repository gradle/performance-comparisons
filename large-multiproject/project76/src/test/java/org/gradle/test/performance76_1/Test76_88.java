package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_88 {
    private final Production76_88 production = new Production76_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}