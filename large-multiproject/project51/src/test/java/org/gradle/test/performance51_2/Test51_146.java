package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_146 {
    private final Production51_146 production = new Production51_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}