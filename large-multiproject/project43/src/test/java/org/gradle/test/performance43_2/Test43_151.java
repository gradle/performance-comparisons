package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_151 {
    private final Production43_151 production = new Production43_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}