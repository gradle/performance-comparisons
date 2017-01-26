package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_313 {
    private final Production61_313 production = new Production61_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}