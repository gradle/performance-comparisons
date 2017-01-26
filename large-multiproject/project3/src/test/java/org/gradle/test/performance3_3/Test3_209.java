package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_209 {
    private final Production3_209 production = new Production3_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}