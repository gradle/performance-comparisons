package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_311 {
    private final Production27_311 production = new Production27_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}