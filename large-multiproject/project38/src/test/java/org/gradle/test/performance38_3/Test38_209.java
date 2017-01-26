package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_209 {
    private final Production38_209 production = new Production38_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}