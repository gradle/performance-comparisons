package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_238 {
    private final Production11_238 production = new Production11_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}