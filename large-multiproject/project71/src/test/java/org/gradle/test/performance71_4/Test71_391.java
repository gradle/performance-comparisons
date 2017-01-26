package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_391 {
    private final Production71_391 production = new Production71_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}