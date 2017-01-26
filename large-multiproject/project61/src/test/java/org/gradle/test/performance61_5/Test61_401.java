package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_401 {
    private final Production61_401 production = new Production61_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}