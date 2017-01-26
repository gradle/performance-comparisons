package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_204 {
    private final Production51_204 production = new Production51_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}