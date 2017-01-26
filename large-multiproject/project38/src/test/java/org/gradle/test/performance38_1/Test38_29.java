package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_29 {
    private final Production38_29 production = new Production38_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}