package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_31 {
    private final Production66_31 production = new Production66_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}