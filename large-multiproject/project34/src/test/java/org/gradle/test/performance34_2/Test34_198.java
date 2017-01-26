package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_198 {
    private final Production34_198 production = new Production34_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}