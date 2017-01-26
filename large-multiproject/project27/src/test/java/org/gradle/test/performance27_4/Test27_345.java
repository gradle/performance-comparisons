package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_345 {
    private final Production27_345 production = new Production27_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}