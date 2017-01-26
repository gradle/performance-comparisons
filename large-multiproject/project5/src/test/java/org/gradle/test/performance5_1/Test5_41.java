package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_41 {
    private final Production5_41 production = new Production5_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}