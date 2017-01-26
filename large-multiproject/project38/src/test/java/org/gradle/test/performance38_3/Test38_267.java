package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_267 {
    private final Production38_267 production = new Production38_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}