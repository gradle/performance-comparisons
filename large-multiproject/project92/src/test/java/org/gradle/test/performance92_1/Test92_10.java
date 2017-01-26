package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_10 {
    private final Production92_10 production = new Production92_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}