package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_321 {
    private final Production43_321 production = new Production43_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}