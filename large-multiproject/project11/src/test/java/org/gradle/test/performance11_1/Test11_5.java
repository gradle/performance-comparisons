package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_5 {
    private final Production11_5 production = new Production11_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}