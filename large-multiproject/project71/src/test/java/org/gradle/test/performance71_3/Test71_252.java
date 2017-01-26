package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_252 {
    private final Production71_252 production = new Production71_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}