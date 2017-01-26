package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_213 {
    private final Production43_213 production = new Production43_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}