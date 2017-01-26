package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_202 {
    private final Production92_202 production = new Production92_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}