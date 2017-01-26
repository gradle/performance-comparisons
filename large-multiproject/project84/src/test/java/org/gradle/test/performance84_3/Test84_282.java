package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_282 {
    private final Production84_282 production = new Production84_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}