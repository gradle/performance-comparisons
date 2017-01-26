package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_469 {
    private final Production71_469 production = new Production71_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}