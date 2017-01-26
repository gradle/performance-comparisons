package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_51 {
    private final Production66_51 production = new Production66_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}