package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_419 {
    private final Production11_419 production = new Production11_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}