package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_274 {
    private final Production71_274 production = new Production71_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}