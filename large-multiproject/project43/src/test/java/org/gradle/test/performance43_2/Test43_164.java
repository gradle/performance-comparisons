package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_164 {
    private final Production43_164 production = new Production43_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}