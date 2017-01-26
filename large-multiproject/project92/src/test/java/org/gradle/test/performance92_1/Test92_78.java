package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_78 {
    private final Production92_78 production = new Production92_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}