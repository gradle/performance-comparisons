package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_388 {
    private final Production62_388 production = new Production62_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}