package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_169 {
    private final Production71_169 production = new Production71_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}