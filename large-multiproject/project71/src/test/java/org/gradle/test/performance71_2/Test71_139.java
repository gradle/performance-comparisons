package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_139 {
    private final Production71_139 production = new Production71_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}