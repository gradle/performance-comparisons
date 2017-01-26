package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_206 {
    private final Production71_206 production = new Production71_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}