package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_477 {
    private final Production11_477 production = new Production11_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}