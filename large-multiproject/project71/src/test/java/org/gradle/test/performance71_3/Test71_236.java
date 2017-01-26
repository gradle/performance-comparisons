package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_236 {
    private final Production71_236 production = new Production71_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}