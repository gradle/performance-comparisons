package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_115 {
    private final Production99_115 production = new Production99_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}