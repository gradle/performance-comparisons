package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_58 {
    private final Production5_58 production = new Production5_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}