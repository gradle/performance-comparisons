package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_213 {
    private final Production61_213 production = new Production61_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}