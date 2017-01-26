package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_57 {
    private final Production71_57 production = new Production71_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}