package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_224 {
    private final Production51_224 production = new Production51_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}