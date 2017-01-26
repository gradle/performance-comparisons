package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_157 {
    private final Production62_157 production = new Production62_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}