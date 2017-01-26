package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_24 {
    private final Production71_24 production = new Production71_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}