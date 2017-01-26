package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_294 {
    private final Production5_294 production = new Production5_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}