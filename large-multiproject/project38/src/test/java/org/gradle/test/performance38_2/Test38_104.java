package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_104 {
    private final Production38_104 production = new Production38_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}