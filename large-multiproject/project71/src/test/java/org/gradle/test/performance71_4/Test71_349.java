package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_349 {
    private final Production71_349 production = new Production71_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}