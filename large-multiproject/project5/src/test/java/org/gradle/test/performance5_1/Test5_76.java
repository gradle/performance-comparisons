package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_76 {
    private final Production5_76 production = new Production5_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}