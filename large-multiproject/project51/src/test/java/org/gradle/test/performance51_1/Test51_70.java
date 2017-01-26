package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_70 {
    private final Production51_70 production = new Production51_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}