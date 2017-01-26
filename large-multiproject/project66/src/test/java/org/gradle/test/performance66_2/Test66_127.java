package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_127 {
    private final Production66_127 production = new Production66_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}