package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_40 {
    private final Production92_40 production = new Production92_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}