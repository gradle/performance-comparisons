package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_250 {
    private final Production27_250 production = new Production27_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}