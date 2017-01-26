package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_4 {
    private final Production11_4 production = new Production11_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}