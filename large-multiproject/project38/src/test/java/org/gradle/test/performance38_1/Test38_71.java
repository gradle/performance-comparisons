package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_71 {
    private final Production38_71 production = new Production38_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}