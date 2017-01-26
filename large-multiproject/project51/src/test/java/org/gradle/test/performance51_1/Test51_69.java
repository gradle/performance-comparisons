package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_69 {
    private final Production51_69 production = new Production51_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}