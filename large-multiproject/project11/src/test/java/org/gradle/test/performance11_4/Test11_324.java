package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_324 {
    private final Production11_324 production = new Production11_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}