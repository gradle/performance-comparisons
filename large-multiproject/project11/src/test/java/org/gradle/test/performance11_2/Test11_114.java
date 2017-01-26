package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_114 {
    private final Production11_114 production = new Production11_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}