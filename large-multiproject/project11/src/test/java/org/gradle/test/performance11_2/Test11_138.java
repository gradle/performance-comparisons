package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_138 {
    private final Production11_138 production = new Production11_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}