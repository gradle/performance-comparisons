package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_298 {
    private final Production71_298 production = new Production71_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}