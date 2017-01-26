package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_154 {
    private final Production43_154 production = new Production43_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}