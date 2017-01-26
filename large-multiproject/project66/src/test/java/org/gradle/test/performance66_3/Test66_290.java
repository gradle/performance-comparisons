package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_290 {
    private final Production66_290 production = new Production66_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}