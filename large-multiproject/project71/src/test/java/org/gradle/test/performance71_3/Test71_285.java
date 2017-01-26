package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_285 {
    private final Production71_285 production = new Production71_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}