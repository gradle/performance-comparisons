package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_468 {
    private final Production11_468 production = new Production11_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}