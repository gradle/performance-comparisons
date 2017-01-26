package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_266 {
    private final Production11_266 production = new Production11_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}