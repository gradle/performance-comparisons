package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_115 {
    private final Production51_115 production = new Production51_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}