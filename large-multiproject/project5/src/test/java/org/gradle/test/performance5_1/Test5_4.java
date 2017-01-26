package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_4 {
    private final Production5_4 production = new Production5_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}