package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_371 {
    private final Production71_371 production = new Production71_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}