package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_170 {
    private final Production51_170 production = new Production51_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}