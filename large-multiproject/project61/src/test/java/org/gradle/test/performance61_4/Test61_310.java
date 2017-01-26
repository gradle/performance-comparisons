package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_310 {
    private final Production61_310 production = new Production61_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}