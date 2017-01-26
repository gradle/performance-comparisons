package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_127 {
    private final Production43_127 production = new Production43_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}