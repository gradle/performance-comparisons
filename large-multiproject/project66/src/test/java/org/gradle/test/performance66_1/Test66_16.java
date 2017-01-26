package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_16 {
    private final Production66_16 production = new Production66_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}