package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_406 {
    private final Production76_406 production = new Production76_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}