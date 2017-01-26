package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_80 {
    private final Production5_80 production = new Production5_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}