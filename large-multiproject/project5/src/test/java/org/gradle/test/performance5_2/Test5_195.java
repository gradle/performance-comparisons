package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_195 {
    private final Production5_195 production = new Production5_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}