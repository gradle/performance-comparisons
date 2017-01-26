package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_328 {
    private final Production14_328 production = new Production14_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}