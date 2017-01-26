package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_452 {
    private final Production71_452 production = new Production71_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}