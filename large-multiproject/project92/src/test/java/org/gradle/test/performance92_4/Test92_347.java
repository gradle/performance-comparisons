package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_347 {
    private final Production92_347 production = new Production92_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}