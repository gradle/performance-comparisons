package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_83 {
    private final Production51_83 production = new Production51_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}