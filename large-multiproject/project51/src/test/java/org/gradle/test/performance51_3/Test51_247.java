package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_247 {
    private final Production51_247 production = new Production51_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}