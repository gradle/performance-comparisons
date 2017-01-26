package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_398 {
    private final Production43_398 production = new Production43_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}