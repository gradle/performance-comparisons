package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_61 {
    private final Production5_61 production = new Production5_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}