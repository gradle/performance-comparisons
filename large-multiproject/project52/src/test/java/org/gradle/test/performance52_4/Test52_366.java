package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_366 {
    private final Production52_366 production = new Production52_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}