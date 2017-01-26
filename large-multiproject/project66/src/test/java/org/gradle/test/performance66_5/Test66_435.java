package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_435 {
    private final Production66_435 production = new Production66_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}