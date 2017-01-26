package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_126 {
    private final Production38_126 production = new Production38_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}