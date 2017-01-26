package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_103 {
    private final Production51_103 production = new Production51_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}