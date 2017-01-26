package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_2 {
    private final Production11_2 production = new Production11_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}