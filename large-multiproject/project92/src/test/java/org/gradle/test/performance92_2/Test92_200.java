package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_200 {
    private final Production92_200 production = new Production92_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}