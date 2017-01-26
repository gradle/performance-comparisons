package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_75 {
    private final Production5_75 production = new Production5_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}