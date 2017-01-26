package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_282 {
    private final Production4_282 production = new Production4_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}