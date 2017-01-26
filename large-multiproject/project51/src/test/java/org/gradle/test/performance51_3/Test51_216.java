package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_216 {
    private final Production51_216 production = new Production51_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}