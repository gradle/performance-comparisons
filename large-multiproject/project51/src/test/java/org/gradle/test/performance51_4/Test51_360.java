package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_360 {
    private final Production51_360 production = new Production51_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}