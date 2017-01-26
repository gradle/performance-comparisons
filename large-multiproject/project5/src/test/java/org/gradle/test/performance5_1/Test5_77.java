package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_77 {
    private final Production5_77 production = new Production5_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}