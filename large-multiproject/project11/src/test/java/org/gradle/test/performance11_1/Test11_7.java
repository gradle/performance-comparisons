package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_7 {
    private final Production11_7 production = new Production11_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}