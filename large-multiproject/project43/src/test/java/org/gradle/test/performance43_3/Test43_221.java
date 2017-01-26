package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_221 {
    private final Production43_221 production = new Production43_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}