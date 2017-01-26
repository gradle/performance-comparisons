package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_136 {
    private final Production11_136 production = new Production11_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}