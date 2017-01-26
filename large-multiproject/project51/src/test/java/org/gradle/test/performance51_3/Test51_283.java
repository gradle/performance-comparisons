package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_283 {
    private final Production51_283 production = new Production51_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}