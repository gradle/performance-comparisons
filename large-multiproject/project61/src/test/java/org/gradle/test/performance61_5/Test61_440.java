package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_440 {
    private final Production61_440 production = new Production61_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}