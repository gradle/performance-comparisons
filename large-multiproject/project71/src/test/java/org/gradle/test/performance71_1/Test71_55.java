package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_55 {
    private final Production71_55 production = new Production71_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}