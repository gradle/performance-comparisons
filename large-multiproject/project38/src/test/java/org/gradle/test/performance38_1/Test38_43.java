package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_43 {
    private final Production38_43 production = new Production38_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}