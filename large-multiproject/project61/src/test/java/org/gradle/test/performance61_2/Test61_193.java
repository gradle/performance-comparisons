package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_193 {
    private final Production61_193 production = new Production61_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}