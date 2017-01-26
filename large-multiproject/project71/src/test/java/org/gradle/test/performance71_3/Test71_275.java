package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_275 {
    private final Production71_275 production = new Production71_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}