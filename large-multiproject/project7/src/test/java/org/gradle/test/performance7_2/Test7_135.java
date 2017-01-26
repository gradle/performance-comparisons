package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_135 {
    private final Production7_135 production = new Production7_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}