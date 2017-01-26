package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_340 {
    private final Production51_340 production = new Production51_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}