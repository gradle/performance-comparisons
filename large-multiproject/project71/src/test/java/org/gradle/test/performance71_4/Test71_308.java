package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_308 {
    private final Production71_308 production = new Production71_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}