package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_217 {
    private final Production11_217 production = new Production11_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}