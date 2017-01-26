package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_105 {
    private final Production66_105 production = new Production66_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}