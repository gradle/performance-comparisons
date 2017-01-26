package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_229 {
    private final Production38_229 production = new Production38_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}