package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_462 {
    private final Production51_462 production = new Production51_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}