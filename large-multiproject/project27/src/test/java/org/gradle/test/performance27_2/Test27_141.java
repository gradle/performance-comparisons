package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_141 {
    private final Production27_141 production = new Production27_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}