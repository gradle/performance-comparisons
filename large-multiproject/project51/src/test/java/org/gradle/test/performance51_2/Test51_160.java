package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_160 {
    private final Production51_160 production = new Production51_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}