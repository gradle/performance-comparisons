package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_468 {
    private final Production71_468 production = new Production71_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}