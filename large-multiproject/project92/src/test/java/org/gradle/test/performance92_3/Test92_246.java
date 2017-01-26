package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_246 {
    private final Production92_246 production = new Production92_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}