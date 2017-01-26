package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_39 {
    private final Production11_39 production = new Production11_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}