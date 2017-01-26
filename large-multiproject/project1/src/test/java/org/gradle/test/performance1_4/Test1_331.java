package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_331 {
    private final Production1_331 production = new Production1_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}