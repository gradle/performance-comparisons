package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_192 {
    private final Production11_192 production = new Production11_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}