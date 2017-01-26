package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_419 {
    private final Production66_419 production = new Production66_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}