package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_110 {
    private final Production71_110 production = new Production71_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}