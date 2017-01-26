package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_284 {
    private final Production66_284 production = new Production66_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}