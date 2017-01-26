package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_36 {
    private final Production66_36 production = new Production66_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}