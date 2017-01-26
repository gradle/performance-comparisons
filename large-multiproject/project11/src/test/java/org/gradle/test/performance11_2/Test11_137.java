package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_137 {
    private final Production11_137 production = new Production11_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}