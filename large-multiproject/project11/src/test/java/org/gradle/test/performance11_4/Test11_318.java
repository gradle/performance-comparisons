package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_318 {
    private final Production11_318 production = new Production11_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}