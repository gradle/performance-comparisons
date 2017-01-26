package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_276 {
    private final Production71_276 production = new Production71_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}