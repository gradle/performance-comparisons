package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_287 {
    private final Production66_287 production = new Production66_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}