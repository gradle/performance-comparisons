package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_347 {
    private final Production62_347 production = new Production62_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}