package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_384 {
    private final Production71_384 production = new Production71_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}