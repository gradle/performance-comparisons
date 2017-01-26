package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_280 {
    private final Production51_280 production = new Production51_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}