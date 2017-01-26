package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_231 {
    private final Production5_231 production = new Production5_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}