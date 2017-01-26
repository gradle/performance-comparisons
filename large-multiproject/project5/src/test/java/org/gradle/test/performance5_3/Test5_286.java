package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_286 {
    private final Production5_286 production = new Production5_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}