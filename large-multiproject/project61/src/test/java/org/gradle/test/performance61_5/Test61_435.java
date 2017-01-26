package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_435 {
    private final Production61_435 production = new Production61_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}