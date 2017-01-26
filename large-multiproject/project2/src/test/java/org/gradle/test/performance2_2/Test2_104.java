package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_104 {
    private final Production2_104 production = new Production2_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}