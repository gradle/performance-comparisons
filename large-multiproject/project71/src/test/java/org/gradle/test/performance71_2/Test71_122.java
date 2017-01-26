package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_122 {
    private final Production71_122 production = new Production71_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}