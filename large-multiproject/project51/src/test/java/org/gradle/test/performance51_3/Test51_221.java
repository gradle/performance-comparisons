package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_221 {
    private final Production51_221 production = new Production51_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}