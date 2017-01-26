package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_330 {
    private final Production5_330 production = new Production5_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}