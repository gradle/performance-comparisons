package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_122 {
    private final Production66_122 production = new Production66_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}