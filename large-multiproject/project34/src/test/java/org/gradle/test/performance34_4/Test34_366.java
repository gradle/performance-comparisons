package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_366 {
    private final Production34_366 production = new Production34_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}