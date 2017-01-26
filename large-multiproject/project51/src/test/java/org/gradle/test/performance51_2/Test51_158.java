package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_158 {
    private final Production51_158 production = new Production51_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}