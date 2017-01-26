package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_48 {
    private final Production66_48 production = new Production66_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}