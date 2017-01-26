package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_216 {
    private final Production29_216 production = new Production29_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}