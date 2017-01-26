package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_311 {
    private final Production71_311 production = new Production71_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}