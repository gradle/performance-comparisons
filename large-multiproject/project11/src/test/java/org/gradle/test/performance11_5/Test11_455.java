package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_455 {
    private final Production11_455 production = new Production11_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}