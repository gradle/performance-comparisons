package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_356 {
    private final Production92_356 production = new Production92_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}