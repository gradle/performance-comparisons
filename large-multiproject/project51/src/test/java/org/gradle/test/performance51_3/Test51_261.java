package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_261 {
    private final Production51_261 production = new Production51_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}