package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_1 {
    private final Production2_1 production = new Production2_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}