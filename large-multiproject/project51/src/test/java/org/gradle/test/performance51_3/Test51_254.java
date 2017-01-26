package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_254 {
    private final Production51_254 production = new Production51_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}