package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_405 {
    private final Production61_405 production = new Production61_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}