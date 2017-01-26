package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_92 {
    private final Production11_92 production = new Production11_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}