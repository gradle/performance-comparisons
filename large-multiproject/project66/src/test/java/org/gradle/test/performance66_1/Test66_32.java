package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_32 {
    private final Production66_32 production = new Production66_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}