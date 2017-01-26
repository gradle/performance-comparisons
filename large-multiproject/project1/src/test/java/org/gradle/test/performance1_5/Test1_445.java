package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_445 {
    private final Production1_445 production = new Production1_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}