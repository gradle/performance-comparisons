package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_181 {
    private final Production11_181 production = new Production11_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}