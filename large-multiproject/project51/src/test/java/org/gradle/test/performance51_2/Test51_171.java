package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_171 {
    private final Production51_171 production = new Production51_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}