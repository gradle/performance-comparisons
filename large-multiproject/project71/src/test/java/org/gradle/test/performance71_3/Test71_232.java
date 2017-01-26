package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_232 {
    private final Production71_232 production = new Production71_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}