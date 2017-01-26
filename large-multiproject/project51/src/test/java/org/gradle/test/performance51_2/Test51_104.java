package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_104 {
    private final Production51_104 production = new Production51_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}