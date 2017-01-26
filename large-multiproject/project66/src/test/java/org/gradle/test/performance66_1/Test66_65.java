package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_65 {
    private final Production66_65 production = new Production66_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}