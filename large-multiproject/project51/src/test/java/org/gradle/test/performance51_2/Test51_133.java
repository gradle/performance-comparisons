package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_133 {
    private final Production51_133 production = new Production51_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}