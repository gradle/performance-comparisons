package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_235 {
    private final Production11_235 production = new Production11_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}