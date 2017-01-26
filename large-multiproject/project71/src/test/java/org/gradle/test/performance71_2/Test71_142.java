package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_142 {
    private final Production71_142 production = new Production71_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}