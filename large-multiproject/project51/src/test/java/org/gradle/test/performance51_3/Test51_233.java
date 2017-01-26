package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_233 {
    private final Production51_233 production = new Production51_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}