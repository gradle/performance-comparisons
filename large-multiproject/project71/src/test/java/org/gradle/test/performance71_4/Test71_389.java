package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_389 {
    private final Production71_389 production = new Production71_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}