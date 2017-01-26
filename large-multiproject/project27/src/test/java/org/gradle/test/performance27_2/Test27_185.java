package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_185 {
    private final Production27_185 production = new Production27_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}