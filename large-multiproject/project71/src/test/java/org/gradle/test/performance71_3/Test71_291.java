package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_291 {
    private final Production71_291 production = new Production71_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}