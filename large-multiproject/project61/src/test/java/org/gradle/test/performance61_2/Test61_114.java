package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_114 {
    private final Production61_114 production = new Production61_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}