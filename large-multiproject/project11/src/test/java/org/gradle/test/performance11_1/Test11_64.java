package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_64 {
    private final Production11_64 production = new Production11_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}