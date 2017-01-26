package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_87 {
    private final Production2_87 production = new Production2_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}