package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_441 {
    private final Production61_441 production = new Production61_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}