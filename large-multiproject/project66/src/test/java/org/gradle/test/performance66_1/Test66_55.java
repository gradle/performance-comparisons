package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_55 {
    private final Production66_55 production = new Production66_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}