package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_285 {
    private final Production51_285 production = new Production51_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}