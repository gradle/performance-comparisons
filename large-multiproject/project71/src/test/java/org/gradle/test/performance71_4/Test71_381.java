package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_381 {
    private final Production71_381 production = new Production71_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}