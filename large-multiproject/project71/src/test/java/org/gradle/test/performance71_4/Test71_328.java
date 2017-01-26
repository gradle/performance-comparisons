package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_328 {
    private final Production71_328 production = new Production71_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}