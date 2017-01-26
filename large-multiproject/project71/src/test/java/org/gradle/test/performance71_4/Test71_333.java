package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_333 {
    private final Production71_333 production = new Production71_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}