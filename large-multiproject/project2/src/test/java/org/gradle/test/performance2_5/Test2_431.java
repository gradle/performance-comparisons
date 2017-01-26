package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_431 {
    private final Production2_431 production = new Production2_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}