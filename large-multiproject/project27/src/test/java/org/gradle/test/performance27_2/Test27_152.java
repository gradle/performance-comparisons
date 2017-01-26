package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_152 {
    private final Production27_152 production = new Production27_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}