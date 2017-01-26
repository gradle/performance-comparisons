package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_398 {
    private final Production11_398 production = new Production11_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}