package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_161 {
    private final Production51_161 production = new Production51_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}