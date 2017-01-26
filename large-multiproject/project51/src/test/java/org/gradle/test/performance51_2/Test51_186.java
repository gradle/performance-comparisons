package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_186 {
    private final Production51_186 production = new Production51_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}