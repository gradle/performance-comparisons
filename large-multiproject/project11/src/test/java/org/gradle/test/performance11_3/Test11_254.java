package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_254 {
    private final Production11_254 production = new Production11_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}