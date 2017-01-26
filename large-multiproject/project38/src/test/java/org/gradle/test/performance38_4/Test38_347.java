package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_347 {
    private final Production38_347 production = new Production38_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}