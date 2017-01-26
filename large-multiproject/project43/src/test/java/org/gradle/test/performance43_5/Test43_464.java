package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_464 {
    private final Production43_464 production = new Production43_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}