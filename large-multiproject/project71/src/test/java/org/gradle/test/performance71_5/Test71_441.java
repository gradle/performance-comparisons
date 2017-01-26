package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_441 {
    private final Production71_441 production = new Production71_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}