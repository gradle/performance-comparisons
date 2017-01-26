package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_172 {
    private final Production4_172 production = new Production4_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}