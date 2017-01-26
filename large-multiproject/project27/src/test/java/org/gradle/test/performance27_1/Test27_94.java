package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_94 {
    private final Production27_94 production = new Production27_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}