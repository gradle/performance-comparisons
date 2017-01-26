package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_237 {
    private final Production51_237 production = new Production51_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}