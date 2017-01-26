package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_420 {
    private final Production71_420 production = new Production71_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}