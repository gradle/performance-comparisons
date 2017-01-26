package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_95 {
    private final Production11_95 production = new Production11_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}