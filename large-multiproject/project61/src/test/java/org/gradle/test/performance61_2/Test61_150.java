package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_150 {
    private final Production61_150 production = new Production61_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}