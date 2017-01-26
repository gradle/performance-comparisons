package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_381 {
    private final Production15_381 production = new Production15_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}