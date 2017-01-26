package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_275 {
    private final Production51_275 production = new Production51_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}