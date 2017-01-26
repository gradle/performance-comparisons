package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_213 {
    private final Production51_213 production = new Production51_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}