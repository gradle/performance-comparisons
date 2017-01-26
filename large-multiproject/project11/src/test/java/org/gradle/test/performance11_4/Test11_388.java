package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_388 {
    private final Production11_388 production = new Production11_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}