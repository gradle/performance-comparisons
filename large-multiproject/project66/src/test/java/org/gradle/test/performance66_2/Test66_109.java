package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_109 {
    private final Production66_109 production = new Production66_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}