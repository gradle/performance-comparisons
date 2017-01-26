package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_395 {
    private final Production11_395 production = new Production11_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}