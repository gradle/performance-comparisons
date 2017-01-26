package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_340 {
    private final Production27_340 production = new Production27_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}