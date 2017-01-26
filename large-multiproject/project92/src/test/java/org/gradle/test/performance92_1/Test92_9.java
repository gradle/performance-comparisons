package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_9 {
    private final Production92_9 production = new Production92_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}