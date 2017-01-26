package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_203 {
    private final Production43_203 production = new Production43_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}