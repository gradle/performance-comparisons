package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_6 {
    private final Production11_6 production = new Production11_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}