package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_64 {
    private final Production71_64 production = new Production71_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}