package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_241 {
    private final Production5_241 production = new Production5_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}