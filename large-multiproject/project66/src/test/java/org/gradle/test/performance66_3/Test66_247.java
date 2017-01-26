package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_247 {
    private final Production66_247 production = new Production66_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}