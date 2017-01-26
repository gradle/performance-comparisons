package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_312 {
    private final Production27_312 production = new Production27_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}