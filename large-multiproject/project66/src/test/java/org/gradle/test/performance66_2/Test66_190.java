package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_190 {
    private final Production66_190 production = new Production66_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}