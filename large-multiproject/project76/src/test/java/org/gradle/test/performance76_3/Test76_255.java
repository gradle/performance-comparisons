package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_255 {
    private final Production76_255 production = new Production76_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}