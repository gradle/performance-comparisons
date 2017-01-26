package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_321 {
    private final Production71_321 production = new Production71_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}