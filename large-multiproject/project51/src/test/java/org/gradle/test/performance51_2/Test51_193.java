package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_193 {
    private final Production51_193 production = new Production51_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}