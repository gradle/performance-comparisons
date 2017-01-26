package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_161 {
    private final Production61_161 production = new Production61_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}