package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_279 {
    private final Production71_279 production = new Production71_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}