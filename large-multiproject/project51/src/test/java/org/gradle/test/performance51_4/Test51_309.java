package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_309 {
    private final Production51_309 production = new Production51_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}