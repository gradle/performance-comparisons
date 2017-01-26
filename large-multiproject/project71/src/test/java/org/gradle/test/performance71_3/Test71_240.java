package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_240 {
    private final Production71_240 production = new Production71_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}