package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_80 {
    private final Production38_80 production = new Production38_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}