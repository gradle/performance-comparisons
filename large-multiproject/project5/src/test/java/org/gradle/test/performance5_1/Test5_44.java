package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_44 {
    private final Production5_44 production = new Production5_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}