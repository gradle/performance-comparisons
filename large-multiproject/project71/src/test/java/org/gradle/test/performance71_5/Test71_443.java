package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_443 {
    private final Production71_443 production = new Production71_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}