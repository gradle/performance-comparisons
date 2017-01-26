package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_60 {
    private final Production11_60 production = new Production11_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}