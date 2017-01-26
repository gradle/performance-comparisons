package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_278 {
    private final Production27_278 production = new Production27_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}