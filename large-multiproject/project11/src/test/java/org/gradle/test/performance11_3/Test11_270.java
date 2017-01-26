package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_270 {
    private final Production11_270 production = new Production11_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}