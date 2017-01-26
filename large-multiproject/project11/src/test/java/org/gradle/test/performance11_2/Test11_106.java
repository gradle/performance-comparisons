package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_106 {
    private final Production11_106 production = new Production11_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}