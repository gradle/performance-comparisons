package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_381 {
    private final Production51_381 production = new Production51_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}