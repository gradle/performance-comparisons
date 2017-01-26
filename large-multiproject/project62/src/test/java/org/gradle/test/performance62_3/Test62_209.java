package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_209 {
    private final Production62_209 production = new Production62_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}