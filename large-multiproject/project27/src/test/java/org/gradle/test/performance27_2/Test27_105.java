package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_105 {
    private final Production27_105 production = new Production27_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}