package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_366 {
    private final Production51_366 production = new Production51_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}