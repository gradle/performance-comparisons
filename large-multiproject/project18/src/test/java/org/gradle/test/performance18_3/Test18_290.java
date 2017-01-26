package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_290 {
    private final Production18_290 production = new Production18_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}