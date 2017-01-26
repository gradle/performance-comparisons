package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_49 {
    private final Production76_49 production = new Production76_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}