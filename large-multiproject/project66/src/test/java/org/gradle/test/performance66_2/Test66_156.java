package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_156 {
    private final Production66_156 production = new Production66_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}