package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_442 {
    private final Production5_442 production = new Production5_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}