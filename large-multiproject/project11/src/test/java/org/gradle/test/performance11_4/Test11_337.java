package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_337 {
    private final Production11_337 production = new Production11_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}