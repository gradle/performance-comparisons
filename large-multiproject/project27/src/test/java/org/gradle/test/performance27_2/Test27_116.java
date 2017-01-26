package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_116 {
    private final Production27_116 production = new Production27_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}