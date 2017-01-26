package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_131 {
    private final Production43_131 production = new Production43_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}