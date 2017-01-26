package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_363 {
    private final Production51_363 production = new Production51_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}