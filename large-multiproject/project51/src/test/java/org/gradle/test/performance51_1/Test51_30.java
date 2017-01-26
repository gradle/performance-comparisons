package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_30 {
    private final Production51_30 production = new Production51_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}