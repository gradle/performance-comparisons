package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_140 {
    private final Production43_140 production = new Production43_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}