package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_110 {
    private final Production66_110 production = new Production66_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}