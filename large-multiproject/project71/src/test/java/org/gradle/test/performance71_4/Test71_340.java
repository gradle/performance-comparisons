package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_340 {
    private final Production71_340 production = new Production71_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}