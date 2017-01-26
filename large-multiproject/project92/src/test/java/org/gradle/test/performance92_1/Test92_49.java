package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_49 {
    private final Production92_49 production = new Production92_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}