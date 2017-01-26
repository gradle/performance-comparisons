package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_242 {
    private final Production71_242 production = new Production71_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}