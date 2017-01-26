package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_291 {
    private final Production27_291 production = new Production27_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}