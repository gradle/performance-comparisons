package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_401 {
    private final Production66_401 production = new Production66_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}