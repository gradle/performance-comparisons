package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_491 {
    private final Production51_491 production = new Production51_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}