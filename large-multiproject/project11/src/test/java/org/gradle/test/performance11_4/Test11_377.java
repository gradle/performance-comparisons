package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_377 {
    private final Production11_377 production = new Production11_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}