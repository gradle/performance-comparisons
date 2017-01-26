package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_271 {
    private final Production51_271 production = new Production51_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}