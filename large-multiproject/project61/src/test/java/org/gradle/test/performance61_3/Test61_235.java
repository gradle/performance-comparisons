package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_235 {
    private final Production61_235 production = new Production61_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}