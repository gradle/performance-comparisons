package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_249 {
    private final Production43_249 production = new Production43_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}