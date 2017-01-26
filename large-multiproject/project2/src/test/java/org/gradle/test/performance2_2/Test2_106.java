package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_106 {
    private final Production2_106 production = new Production2_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}