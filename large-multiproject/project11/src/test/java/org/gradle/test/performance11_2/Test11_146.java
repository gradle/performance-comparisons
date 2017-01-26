package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_146 {
    private final Production11_146 production = new Production11_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}