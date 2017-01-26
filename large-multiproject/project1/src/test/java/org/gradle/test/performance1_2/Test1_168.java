package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_168 {
    private final Production1_168 production = new Production1_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}