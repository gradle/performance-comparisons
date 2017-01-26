package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_385 {
    private final Production71_385 production = new Production71_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}