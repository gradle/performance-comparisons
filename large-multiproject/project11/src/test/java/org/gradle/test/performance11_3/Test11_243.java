package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_243 {
    private final Production11_243 production = new Production11_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}