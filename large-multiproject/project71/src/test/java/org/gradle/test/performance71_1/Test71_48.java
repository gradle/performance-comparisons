package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_48 {
    private final Production71_48 production = new Production71_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}