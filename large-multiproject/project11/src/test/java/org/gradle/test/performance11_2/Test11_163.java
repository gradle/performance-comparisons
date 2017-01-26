package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_163 {
    private final Production11_163 production = new Production11_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}