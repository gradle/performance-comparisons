package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_137 {
    private final Production61_137 production = new Production61_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}