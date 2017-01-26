package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_218 {
    private final Production66_218 production = new Production66_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}