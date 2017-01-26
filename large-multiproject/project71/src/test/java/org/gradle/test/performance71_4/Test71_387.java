package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_387 {
    private final Production71_387 production = new Production71_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}