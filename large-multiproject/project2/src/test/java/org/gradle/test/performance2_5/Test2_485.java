package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_485 {
    private final Production2_485 production = new Production2_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}