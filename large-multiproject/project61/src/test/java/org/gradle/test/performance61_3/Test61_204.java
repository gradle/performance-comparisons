package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_204 {
    private final Production61_204 production = new Production61_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}