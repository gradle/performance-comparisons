package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_244 {
    private final Production66_244 production = new Production66_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}