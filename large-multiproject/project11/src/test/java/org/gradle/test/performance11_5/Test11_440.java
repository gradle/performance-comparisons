package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_440 {
    private final Production11_440 production = new Production11_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}