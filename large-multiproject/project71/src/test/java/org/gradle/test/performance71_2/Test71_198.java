package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_198 {
    private final Production71_198 production = new Production71_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}