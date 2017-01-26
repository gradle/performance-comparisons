package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_243 {
    private final Production2_243 production = new Production2_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}