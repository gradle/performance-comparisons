package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_344 {
    private final Production79_344 production = new Production79_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}