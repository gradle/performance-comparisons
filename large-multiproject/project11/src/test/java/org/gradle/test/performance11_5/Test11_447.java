package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_447 {
    private final Production11_447 production = new Production11_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}