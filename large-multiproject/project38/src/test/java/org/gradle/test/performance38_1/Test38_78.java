package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_78 {
    private final Production38_78 production = new Production38_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}