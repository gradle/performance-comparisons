package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_300 {
    private final Production43_300 production = new Production43_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}