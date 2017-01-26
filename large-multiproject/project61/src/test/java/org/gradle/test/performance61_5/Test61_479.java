package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_479 {
    private final Production61_479 production = new Production61_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}