package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_332 {
    private final Production71_332 production = new Production71_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}