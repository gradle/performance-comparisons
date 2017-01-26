package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_125 {
    private final Production71_125 production = new Production71_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}