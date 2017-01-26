package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_104 {
    private final Production74_104 production = new Production74_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}