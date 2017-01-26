package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_131 {
    private final Production51_131 production = new Production51_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}