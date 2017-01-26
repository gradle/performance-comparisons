package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_37 {
    private final Production2_37 production = new Production2_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}