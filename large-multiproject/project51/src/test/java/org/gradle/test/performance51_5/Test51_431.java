package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_431 {
    private final Production51_431 production = new Production51_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}