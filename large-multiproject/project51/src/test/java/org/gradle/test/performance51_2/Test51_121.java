package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_121 {
    private final Production51_121 production = new Production51_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}