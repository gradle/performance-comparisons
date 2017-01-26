package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_213 {
    private final Production11_213 production = new Production11_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}