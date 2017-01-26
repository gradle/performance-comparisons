package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_100 {
    private final Production5_100 production = new Production5_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}