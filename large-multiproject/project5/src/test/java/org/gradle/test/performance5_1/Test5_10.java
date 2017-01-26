package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_10 {
    private final Production5_10 production = new Production5_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}