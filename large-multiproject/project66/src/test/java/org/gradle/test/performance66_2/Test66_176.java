package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_176 {
    private final Production66_176 production = new Production66_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}