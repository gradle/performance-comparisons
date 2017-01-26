package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_370 {
    private final Production2_370 production = new Production2_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}