package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_321 {
    private final Production61_321 production = new Production61_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}