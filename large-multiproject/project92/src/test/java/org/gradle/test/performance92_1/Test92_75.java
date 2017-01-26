package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_75 {
    private final Production92_75 production = new Production92_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}