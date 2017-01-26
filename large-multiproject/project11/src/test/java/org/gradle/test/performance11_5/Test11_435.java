package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_435 {
    private final Production11_435 production = new Production11_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}