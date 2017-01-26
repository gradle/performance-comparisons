package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_233 {
    private final Production71_233 production = new Production71_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}