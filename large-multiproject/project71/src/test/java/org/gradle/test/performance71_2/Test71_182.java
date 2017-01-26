package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_182 {
    private final Production71_182 production = new Production71_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}