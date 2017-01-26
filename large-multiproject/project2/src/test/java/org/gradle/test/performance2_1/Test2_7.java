package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_7 {
    private final Production2_7 production = new Production2_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}