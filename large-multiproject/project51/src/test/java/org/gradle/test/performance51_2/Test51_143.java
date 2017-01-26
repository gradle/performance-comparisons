package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_143 {
    private final Production51_143 production = new Production51_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}