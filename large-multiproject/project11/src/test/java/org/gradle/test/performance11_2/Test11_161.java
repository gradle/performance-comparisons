package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_161 {
    private final Production11_161 production = new Production11_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}