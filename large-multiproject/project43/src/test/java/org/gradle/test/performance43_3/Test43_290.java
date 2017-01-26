package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_290 {
    private final Production43_290 production = new Production43_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}