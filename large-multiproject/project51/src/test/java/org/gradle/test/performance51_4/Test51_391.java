package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_391 {
    private final Production51_391 production = new Production51_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}