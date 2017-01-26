package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_135 {
    private final Production37_135 production = new Production37_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}