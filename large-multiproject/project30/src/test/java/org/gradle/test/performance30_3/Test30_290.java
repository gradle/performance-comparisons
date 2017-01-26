package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_290 {
    private final Production30_290 production = new Production30_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}