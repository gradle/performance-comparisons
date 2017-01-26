package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_403 {
    private final Production61_403 production = new Production61_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}