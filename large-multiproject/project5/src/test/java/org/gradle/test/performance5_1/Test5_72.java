package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_72 {
    private final Production5_72 production = new Production5_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}