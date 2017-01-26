package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_322 {
    private final Production61_322 production = new Production61_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}