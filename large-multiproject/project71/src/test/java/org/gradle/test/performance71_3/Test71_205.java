package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_205 {
    private final Production71_205 production = new Production71_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}