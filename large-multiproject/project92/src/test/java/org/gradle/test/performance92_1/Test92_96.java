package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_96 {
    private final Production92_96 production = new Production92_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}