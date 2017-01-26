package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_347 {
    private final Production4_347 production = new Production4_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}