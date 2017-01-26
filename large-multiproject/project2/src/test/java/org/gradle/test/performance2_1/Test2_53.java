package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_53 {
    private final Production2_53 production = new Production2_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}