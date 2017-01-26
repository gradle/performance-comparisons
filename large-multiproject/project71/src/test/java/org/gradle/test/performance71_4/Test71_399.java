package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_399 {
    private final Production71_399 production = new Production71_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}