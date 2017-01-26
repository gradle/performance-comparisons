package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_427 {
    private final Production12_427 production = new Production12_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}