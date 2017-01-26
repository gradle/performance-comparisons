package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_129 {
    private final Production51_129 production = new Production51_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}