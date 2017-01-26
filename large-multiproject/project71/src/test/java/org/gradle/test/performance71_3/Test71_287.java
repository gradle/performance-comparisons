package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_287 {
    private final Production71_287 production = new Production71_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}