package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_186 {
    private final Production11_186 production = new Production11_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}