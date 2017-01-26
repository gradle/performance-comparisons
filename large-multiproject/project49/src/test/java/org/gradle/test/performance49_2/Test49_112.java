package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_112 {
    private final Production49_112 production = new Production49_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}