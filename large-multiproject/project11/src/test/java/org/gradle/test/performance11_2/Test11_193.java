package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_193 {
    private final Production11_193 production = new Production11_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}