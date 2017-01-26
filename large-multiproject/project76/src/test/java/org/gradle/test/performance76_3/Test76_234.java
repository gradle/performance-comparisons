package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_234 {
    private final Production76_234 production = new Production76_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}