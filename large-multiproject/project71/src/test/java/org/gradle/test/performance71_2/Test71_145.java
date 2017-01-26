package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_145 {
    private final Production71_145 production = new Production71_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}