package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_175 {
    private final Production71_175 production = new Production71_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}