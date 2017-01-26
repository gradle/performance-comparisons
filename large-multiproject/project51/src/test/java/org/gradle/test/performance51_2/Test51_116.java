package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_116 {
    private final Production51_116 production = new Production51_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}