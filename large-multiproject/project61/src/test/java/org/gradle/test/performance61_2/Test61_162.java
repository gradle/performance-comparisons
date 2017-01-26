package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_162 {
    private final Production61_162 production = new Production61_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}