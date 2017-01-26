package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_32 {
    private final Production27_32 production = new Production27_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}