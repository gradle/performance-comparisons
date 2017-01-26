package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_192 {
    private final Production71_192 production = new Production71_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}