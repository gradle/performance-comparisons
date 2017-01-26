package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_402 {
    private final Production71_402 production = new Production71_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}