package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_162 {
    private final Production43_162 production = new Production43_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}