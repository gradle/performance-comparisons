package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_151 {
    private final Production61_151 production = new Production61_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}