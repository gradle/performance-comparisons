package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_400 {
    private final Production71_400 production = new Production71_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}