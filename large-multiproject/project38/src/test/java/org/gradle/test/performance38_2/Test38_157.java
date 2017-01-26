package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_157 {
    private final Production38_157 production = new Production38_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}