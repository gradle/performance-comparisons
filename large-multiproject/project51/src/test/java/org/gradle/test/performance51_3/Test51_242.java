package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_242 {
    private final Production51_242 production = new Production51_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}