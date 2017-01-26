package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_40 {
    private final Production5_40 production = new Production5_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}