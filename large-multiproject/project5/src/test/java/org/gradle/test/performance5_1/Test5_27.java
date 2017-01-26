package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_27 {
    private final Production5_27 production = new Production5_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}