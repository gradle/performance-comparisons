package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_346 {
    private final Production51_346 production = new Production51_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}