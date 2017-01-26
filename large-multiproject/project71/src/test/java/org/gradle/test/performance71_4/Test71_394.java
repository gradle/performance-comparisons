package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_394 {
    private final Production71_394 production = new Production71_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}