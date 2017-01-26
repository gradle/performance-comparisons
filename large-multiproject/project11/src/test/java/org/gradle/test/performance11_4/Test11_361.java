package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_361 {
    private final Production11_361 production = new Production11_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}