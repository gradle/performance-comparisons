package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_390 {
    private final Production11_390 production = new Production11_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}