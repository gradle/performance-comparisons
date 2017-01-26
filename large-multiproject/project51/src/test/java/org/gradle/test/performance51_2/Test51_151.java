package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_151 {
    private final Production51_151 production = new Production51_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}