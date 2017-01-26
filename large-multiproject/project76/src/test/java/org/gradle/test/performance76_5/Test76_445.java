package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_445 {
    private final Production76_445 production = new Production76_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}