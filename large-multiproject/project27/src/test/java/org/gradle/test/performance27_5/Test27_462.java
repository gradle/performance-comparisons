package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_462 {
    private final Production27_462 production = new Production27_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}