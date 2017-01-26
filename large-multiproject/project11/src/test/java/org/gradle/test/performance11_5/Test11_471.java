package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_471 {
    private final Production11_471 production = new Production11_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}