package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_370 {
    private final Production14_370 production = new Production14_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}