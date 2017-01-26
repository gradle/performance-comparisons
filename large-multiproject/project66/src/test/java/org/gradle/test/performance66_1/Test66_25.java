package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_25 {
    private final Production66_25 production = new Production66_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}