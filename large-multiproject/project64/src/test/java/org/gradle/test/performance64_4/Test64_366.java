package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_366 {
    private final Production64_366 production = new Production64_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}