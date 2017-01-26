package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_415 {
    private final Production38_415 production = new Production38_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}