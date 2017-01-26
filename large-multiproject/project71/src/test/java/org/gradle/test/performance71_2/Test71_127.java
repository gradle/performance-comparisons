package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_127 {
    private final Production71_127 production = new Production71_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}