package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_135 {
    private final Production73_135 production = new Production73_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}