package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_271 {
    private final Production71_271 production = new Production71_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}