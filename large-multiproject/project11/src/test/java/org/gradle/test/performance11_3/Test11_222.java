package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_222 {
    private final Production11_222 production = new Production11_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}