package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_225 {
    private final Production4_225 production = new Production4_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}