package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_268 {
    private final Production5_268 production = new Production5_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}