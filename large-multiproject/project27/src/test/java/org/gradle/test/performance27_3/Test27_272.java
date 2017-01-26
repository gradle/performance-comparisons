package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_272 {
    private final Production27_272 production = new Production27_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}