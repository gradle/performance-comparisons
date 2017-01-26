package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_190 {
    private final Production51_190 production = new Production51_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}