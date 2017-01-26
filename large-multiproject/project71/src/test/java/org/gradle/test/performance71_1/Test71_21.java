package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_21 {
    private final Production71_21 production = new Production71_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}