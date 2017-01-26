package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_337 {
    private final Production43_337 production = new Production43_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}