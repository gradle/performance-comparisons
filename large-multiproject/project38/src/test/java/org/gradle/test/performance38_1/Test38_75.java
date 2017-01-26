package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_75 {
    private final Production38_75 production = new Production38_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}