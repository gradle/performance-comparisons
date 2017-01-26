package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_149 {
    private final Production51_149 production = new Production51_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}