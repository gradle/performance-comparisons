package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_88 {
    private final Production1_88 production = new Production1_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}