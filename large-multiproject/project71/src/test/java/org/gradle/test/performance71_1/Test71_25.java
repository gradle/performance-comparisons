package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_25 {
    private final Production71_25 production = new Production71_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}