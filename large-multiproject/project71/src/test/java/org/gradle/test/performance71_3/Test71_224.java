package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_224 {
    private final Production71_224 production = new Production71_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}