package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_112 {
    private final Production62_112 production = new Production62_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}