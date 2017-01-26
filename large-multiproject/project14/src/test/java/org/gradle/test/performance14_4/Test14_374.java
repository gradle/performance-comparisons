package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_374 {
    private final Production14_374 production = new Production14_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}