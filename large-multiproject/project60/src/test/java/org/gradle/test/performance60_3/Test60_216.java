package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_216 {
    private final Production60_216 production = new Production60_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}