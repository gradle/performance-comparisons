package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_38 {
    private final Production5_38 production = new Production5_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}