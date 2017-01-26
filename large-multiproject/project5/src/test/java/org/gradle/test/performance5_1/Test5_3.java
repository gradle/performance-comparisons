package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_3 {
    private final Production5_3 production = new Production5_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}