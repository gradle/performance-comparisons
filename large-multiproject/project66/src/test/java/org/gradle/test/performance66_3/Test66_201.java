package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_201 {
    private final Production66_201 production = new Production66_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}