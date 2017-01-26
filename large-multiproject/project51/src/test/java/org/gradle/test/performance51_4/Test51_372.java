package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_372 {
    private final Production51_372 production = new Production51_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}