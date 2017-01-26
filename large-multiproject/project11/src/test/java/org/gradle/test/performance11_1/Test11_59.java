package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_59 {
    private final Production11_59 production = new Production11_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}