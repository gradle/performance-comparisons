package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_16 {
    private final Production15_16 production = new Production15_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}