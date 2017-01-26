package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_320 {
    private final Production11_320 production = new Production11_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}