package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_68 {
    private final Production1_68 production = new Production1_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}