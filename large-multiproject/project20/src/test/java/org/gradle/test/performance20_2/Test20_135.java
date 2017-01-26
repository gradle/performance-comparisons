package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_135 {
    private final Production20_135 production = new Production20_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}