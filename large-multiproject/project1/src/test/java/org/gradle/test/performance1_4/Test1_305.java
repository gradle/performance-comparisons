package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_305 {
    private final Production1_305 production = new Production1_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}