package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_283 {
    private final Production71_283 production = new Production71_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}