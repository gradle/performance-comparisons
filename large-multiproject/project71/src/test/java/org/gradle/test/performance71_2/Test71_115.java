package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_115 {
    private final Production71_115 production = new Production71_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}