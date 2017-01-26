package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_177 {
    private final Production71_177 production = new Production71_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}