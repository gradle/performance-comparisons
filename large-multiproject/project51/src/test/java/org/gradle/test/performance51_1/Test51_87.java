package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_87 {
    private final Production51_87 production = new Production51_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}