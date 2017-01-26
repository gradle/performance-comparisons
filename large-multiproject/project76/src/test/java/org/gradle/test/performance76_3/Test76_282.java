package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_282 {
    private final Production76_282 production = new Production76_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}