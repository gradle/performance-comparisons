package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_287 {
    private final Production51_287 production = new Production51_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}