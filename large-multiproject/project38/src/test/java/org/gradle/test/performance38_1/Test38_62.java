package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_62 {
    private final Production38_62 production = new Production38_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}