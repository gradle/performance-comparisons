package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_290 {
    private final Production7_290 production = new Production7_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}