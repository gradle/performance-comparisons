package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_401 {
    private final Production51_401 production = new Production51_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}