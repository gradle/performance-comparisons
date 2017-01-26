package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_15 {
    private final Production51_15 production = new Production51_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}