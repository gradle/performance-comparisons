package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_300 {
    private final Production66_300 production = new Production66_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}