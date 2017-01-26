package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_385 {
    private final Production51_385 production = new Production51_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}