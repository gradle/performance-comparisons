package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_216 {
    private final Production19_216 production = new Production19_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}