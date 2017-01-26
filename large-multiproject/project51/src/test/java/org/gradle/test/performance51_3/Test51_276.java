package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_276 {
    private final Production51_276 production = new Production51_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}