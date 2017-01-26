package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_302 {
    private final Production71_302 production = new Production71_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}