package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_27 {
    private final Production38_27 production = new Production38_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}