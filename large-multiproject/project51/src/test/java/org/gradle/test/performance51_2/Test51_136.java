package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_136 {
    private final Production51_136 production = new Production51_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}