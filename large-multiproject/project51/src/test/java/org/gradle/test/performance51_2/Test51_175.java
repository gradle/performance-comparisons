package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_175 {
    private final Production51_175 production = new Production51_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}