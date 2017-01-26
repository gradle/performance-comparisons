package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_374 {
    private final Production71_374 production = new Production71_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}