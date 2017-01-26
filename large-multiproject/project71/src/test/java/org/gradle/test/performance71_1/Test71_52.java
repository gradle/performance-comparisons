package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_52 {
    private final Production71_52 production = new Production71_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}