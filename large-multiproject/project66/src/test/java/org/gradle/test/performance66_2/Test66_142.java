package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_142 {
    private final Production66_142 production = new Production66_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}