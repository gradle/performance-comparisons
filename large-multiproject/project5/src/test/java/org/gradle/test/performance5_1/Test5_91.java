package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_91 {
    private final Production5_91 production = new Production5_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}