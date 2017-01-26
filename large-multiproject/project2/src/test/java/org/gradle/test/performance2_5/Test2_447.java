package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_447 {
    private final Production2_447 production = new Production2_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}