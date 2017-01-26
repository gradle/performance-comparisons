package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_389 {
    private final Production51_389 production = new Production51_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}