package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_312 {
    private final Production51_312 production = new Production51_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}