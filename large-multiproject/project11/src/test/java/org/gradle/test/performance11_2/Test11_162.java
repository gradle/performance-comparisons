package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_162 {
    private final Production11_162 production = new Production11_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}