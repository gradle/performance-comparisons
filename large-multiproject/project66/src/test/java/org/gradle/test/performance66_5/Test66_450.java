package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_450 {
    private final Production66_450 production = new Production66_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}