package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_230 {
    private final Production1_230 production = new Production1_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}