package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_209 {
    private final Production92_209 production = new Production92_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}