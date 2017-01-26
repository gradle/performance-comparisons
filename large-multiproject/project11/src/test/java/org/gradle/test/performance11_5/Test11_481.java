package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_481 {
    private final Production11_481 production = new Production11_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}