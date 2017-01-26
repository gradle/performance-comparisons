package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_421 {
    private final Production61_421 production = new Production61_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}