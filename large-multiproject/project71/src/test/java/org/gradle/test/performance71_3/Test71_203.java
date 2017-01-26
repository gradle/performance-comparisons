package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_203 {
    private final Production71_203 production = new Production71_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}