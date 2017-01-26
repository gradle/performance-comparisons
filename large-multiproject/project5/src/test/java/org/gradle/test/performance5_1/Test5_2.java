package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_2 {
    private final Production5_2 production = new Production5_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}