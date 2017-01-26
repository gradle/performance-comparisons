package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_476 {
    private final Production51_476 production = new Production51_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}