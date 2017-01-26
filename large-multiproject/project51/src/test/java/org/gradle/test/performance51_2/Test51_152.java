package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_152 {
    private final Production51_152 production = new Production51_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}