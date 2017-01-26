package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_290 {
    private final Production5_290 production = new Production5_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}