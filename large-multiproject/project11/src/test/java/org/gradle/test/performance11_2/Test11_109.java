package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_109 {
    private final Production11_109 production = new Production11_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}