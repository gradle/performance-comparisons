package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_62 {
    private final Production5_62 production = new Production5_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}