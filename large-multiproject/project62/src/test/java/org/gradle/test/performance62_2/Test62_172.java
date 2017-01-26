package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_172 {
    private final Production62_172 production = new Production62_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}