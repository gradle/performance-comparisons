package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_6 {
    private final Production2_6 production = new Production2_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}