package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_70 {
    private final Production71_70 production = new Production71_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}