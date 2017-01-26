package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_392 {
    private final Production11_392 production = new Production11_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}