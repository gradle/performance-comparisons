package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_57 {
    private final Production51_57 production = new Production51_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}