package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_261 {
    private final Production71_261 production = new Production71_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}