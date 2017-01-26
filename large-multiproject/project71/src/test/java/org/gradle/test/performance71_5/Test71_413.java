package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_413 {
    private final Production71_413 production = new Production71_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}