package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_456 {
    private final Production71_456 production = new Production71_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}