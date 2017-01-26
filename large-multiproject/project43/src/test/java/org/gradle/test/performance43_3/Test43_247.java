package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_247 {
    private final Production43_247 production = new Production43_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}