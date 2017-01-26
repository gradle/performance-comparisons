package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_216 {
    private final Production49_216 production = new Production49_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}