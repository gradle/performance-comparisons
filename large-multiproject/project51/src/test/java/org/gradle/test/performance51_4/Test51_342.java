package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_342 {
    private final Production51_342 production = new Production51_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}