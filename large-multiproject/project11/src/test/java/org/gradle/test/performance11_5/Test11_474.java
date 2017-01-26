package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_474 {
    private final Production11_474 production = new Production11_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}