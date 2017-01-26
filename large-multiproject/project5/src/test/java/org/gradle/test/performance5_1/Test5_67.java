package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_67 {
    private final Production5_67 production = new Production5_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}