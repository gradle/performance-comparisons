package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_390 {
    private final Production5_390 production = new Production5_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}