package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_294 {
    private final Production92_294 production = new Production92_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}