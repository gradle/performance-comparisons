package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_156 {
    private final Production51_156 production = new Production51_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}