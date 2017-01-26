package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_135 {
    private final Production66_135 production = new Production66_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}