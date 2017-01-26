package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_237 {
    private final Production71_237 production = new Production71_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}