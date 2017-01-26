package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_418 {
    private final Production71_418 production = new Production71_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}