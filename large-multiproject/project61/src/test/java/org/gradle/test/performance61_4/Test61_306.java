package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_306 {
    private final Production61_306 production = new Production61_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}