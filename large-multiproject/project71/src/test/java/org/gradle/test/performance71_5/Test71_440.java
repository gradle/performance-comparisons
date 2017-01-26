package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_440 {
    private final Production71_440 production = new Production71_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}