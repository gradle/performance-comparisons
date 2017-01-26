package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_31 {
    private final Production71_31 production = new Production71_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}