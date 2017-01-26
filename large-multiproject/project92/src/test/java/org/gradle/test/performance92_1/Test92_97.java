package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_97 {
    private final Production92_97 production = new Production92_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}