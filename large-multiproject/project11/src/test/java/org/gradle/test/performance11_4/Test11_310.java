package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_310 {
    private final Production11_310 production = new Production11_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}