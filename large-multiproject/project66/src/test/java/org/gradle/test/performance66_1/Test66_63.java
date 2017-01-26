package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_63 {
    private final Production66_63 production = new Production66_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}