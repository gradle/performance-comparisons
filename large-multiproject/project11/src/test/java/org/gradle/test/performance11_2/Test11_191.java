package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_191 {
    private final Production11_191 production = new Production11_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}