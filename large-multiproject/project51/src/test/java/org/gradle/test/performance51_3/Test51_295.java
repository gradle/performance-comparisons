package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_295 {
    private final Production51_295 production = new Production51_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}