package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_374 {
    private final Production51_374 production = new Production51_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}