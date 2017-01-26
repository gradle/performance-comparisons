package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_145 {
    private final Production51_145 production = new Production51_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}