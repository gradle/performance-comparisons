package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_284 {
    private final Production71_284 production = new Production71_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}