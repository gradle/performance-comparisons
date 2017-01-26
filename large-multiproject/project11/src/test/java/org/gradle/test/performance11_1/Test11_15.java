package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_15 {
    private final Production11_15 production = new Production11_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}