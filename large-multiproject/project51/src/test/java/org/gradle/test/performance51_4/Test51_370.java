package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_370 {
    private final Production51_370 production = new Production51_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}