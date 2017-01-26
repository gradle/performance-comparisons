package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_196 {
    private final Production11_196 production = new Production11_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}