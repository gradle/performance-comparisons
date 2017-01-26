package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_212 {
    private final Production14_212 production = new Production14_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}