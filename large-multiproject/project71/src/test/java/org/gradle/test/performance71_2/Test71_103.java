package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_103 {
    private final Production71_103 production = new Production71_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}