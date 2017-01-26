package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_119 {
    private final Production38_119 production = new Production38_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}