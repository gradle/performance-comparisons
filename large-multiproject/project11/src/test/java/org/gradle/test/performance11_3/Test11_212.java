package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_212 {
    private final Production11_212 production = new Production11_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}