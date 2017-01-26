package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_188 {
    private final Production11_188 production = new Production11_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}