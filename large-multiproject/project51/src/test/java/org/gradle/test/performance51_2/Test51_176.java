package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_176 {
    private final Production51_176 production = new Production51_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}