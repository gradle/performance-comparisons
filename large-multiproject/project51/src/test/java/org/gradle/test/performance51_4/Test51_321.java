package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_321 {
    private final Production51_321 production = new Production51_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}