package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_67 {
    private final Production92_67 production = new Production92_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}