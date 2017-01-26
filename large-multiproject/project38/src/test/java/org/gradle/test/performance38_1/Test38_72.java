package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_72 {
    private final Production38_72 production = new Production38_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}