package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_115 {
    private final Production90_115 production = new Production90_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}