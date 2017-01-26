package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_226 {
    private final Production51_226 production = new Production51_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}