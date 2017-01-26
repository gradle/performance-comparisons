package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_250 {
    private final Production71_250 production = new Production71_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}