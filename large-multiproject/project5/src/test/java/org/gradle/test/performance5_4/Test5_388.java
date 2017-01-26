package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_388 {
    private final Production5_388 production = new Production5_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}