package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_259 {
    private final Production11_259 production = new Production11_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}