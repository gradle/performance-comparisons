package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_163 {
    private final Production38_163 production = new Production38_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}