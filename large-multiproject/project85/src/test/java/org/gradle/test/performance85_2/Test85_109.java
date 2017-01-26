package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_109 {
    private final Production85_109 production = new Production85_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}