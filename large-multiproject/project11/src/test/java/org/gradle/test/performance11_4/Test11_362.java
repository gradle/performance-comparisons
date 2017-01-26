package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_362 {
    private final Production11_362 production = new Production11_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}