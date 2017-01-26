package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_214 {
    private final Production5_214 production = new Production5_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}