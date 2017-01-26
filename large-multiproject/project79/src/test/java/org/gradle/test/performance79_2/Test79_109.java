package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_109 {
    private final Production79_109 production = new Production79_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}