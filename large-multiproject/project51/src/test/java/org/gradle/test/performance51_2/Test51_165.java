package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_165 {
    private final Production51_165 production = new Production51_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}