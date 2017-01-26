package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_300 {
    private final Production11_300 production = new Production11_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}