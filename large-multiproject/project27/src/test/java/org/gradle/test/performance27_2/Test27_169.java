package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_169 {
    private final Production27_169 production = new Production27_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}