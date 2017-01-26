package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_135 {
    private final Production93_135 production = new Production93_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}