package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_106 {
    private final Production51_106 production = new Production51_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}