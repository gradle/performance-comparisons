package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_182 {
    private final Production66_182 production = new Production66_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}