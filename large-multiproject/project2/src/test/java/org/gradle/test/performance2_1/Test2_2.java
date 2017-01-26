package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_2 {
    private final Production2_2 production = new Production2_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}