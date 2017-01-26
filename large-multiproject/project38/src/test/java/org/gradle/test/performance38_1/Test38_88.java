package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_88 {
    private final Production38_88 production = new Production38_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}