package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_148 {
    private final Production51_148 production = new Production51_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}