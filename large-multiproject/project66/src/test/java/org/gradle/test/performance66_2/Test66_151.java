package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_151 {
    private final Production66_151 production = new Production66_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}