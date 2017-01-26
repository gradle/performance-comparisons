package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_108 {
    private final Production51_108 production = new Production51_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}