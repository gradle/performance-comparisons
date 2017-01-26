package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_388 {
    private final Production90_388 production = new Production90_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}