package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_29 {
    private final Production5_29 production = new Production5_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}