package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_162 {
    private final Production71_162 production = new Production71_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}