package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_135 {
    private final Production97_135 production = new Production97_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}