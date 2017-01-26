package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_334 {
    private final Production27_334 production = new Production27_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}