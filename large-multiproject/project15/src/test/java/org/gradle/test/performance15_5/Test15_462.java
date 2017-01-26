package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_462 {
    private final Production15_462 production = new Production15_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}