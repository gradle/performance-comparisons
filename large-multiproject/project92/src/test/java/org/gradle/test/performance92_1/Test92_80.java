package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_80 {
    private final Production92_80 production = new Production92_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}