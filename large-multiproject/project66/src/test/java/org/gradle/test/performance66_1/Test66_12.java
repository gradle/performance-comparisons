package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_12 {
    private final Production66_12 production = new Production66_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}