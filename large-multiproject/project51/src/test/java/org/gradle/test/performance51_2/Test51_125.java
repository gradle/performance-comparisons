package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_125 {
    private final Production51_125 production = new Production51_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}