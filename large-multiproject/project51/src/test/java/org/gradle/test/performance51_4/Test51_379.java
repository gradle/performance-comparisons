package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_379 {
    private final Production51_379 production = new Production51_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}