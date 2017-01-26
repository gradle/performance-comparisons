package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_492 {
    private final Production61_492 production = new Production61_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}