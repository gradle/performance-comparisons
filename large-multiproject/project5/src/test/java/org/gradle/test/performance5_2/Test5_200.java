package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_200 {
    private final Production5_200 production = new Production5_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}