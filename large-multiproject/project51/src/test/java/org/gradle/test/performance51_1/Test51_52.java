package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_52 {
    private final Production51_52 production = new Production51_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}