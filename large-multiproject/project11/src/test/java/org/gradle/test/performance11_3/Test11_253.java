package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_253 {
    private final Production11_253 production = new Production11_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}