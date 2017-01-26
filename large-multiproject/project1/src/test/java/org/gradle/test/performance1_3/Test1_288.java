package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_288 {
    private final Production1_288 production = new Production1_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}