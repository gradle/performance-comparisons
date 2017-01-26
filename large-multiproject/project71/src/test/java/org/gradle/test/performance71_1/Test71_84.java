package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_84 {
    private final Production71_84 production = new Production71_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}