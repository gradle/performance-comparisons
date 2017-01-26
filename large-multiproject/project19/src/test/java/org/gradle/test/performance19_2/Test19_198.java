package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_198 {
    private final Production19_198 production = new Production19_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}