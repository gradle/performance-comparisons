package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_350 {
    private final Production5_350 production = new Production5_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}