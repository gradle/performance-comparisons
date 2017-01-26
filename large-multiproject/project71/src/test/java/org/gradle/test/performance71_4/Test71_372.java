package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_372 {
    private final Production71_372 production = new Production71_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}