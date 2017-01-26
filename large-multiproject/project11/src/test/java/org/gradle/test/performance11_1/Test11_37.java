package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_37 {
    private final Production11_37 production = new Production11_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}