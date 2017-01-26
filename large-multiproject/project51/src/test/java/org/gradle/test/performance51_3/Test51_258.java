package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_258 {
    private final Production51_258 production = new Production51_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}