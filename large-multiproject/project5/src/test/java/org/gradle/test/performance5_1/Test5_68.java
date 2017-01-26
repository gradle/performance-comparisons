package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_68 {
    private final Production5_68 production = new Production5_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}