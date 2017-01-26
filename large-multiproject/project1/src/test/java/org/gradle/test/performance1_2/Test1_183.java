package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_183 {
    private final Production1_183 production = new Production1_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}