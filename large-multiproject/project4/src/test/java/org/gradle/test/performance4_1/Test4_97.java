package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_97 {
    private final Production4_97 production = new Production4_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}