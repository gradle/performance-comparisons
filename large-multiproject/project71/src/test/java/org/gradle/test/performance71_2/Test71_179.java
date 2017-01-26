package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_179 {
    private final Production71_179 production = new Production71_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}