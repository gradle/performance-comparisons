package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_152 {
    private final Production66_152 production = new Production66_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}