package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_499 {
    private final Production71_499 production = new Production71_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}