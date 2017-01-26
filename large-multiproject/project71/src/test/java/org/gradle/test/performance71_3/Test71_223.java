package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_223 {
    private final Production71_223 production = new Production71_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}