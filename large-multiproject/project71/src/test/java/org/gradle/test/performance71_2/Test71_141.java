package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_141 {
    private final Production71_141 production = new Production71_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}