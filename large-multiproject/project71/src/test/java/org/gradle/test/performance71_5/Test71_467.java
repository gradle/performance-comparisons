package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_467 {
    private final Production71_467 production = new Production71_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}