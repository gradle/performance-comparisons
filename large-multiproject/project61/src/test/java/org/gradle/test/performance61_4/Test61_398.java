package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_398 {
    private final Production61_398 production = new Production61_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}