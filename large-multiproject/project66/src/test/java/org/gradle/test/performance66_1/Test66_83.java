package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_83 {
    private final Production66_83 production = new Production66_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}