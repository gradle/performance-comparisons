package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_251 {
    private final Production92_251 production = new Production92_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}