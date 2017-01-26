package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_323 {
    private final Production11_323 production = new Production11_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}