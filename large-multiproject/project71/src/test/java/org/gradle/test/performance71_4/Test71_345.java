package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_345 {
    private final Production71_345 production = new Production71_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}