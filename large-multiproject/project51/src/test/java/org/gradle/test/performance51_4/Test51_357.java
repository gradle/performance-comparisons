package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_357 {
    private final Production51_357 production = new Production51_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}