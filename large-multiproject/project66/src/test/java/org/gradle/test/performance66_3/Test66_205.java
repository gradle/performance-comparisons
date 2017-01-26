package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_205 {
    private final Production66_205 production = new Production66_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}