package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_205 {
    private final Production51_205 production = new Production51_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}