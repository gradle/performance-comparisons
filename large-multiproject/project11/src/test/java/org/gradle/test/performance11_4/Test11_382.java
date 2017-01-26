package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_382 {
    private final Production11_382 production = new Production11_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}