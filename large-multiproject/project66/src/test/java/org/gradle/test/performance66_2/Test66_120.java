package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_120 {
    private final Production66_120 production = new Production66_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}