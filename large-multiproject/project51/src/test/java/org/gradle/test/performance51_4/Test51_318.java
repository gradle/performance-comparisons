package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_318 {
    private final Production51_318 production = new Production51_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}