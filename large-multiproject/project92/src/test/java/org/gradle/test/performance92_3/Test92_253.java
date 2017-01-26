package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_253 {
    private final Production92_253 production = new Production92_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}