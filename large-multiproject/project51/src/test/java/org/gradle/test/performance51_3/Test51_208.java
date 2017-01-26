package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_208 {
    private final Production51_208 production = new Production51_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}