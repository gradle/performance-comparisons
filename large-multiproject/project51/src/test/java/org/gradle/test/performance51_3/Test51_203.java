package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_203 {
    private final Production51_203 production = new Production51_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}