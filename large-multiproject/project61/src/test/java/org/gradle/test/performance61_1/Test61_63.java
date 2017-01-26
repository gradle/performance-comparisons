package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_63 {
    private final Production61_63 production = new Production61_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}