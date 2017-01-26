package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_113 {
    private final Production51_113 production = new Production51_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}