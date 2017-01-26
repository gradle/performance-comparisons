package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_315 {
    private final Production1_315 production = new Production1_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}