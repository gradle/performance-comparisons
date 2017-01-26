package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_312 {
    private final Production71_312 production = new Production71_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}